class LinearProbing<T>
{
    private int currentSize;
    int maxSize;
    KeyValue<T>[] keyvalue;
    boolean Bit[];
    public LinearProbing(){}
    public LinearProbing(int capacity){
        maxSize=capacity;
        currentSize=0;
        keyvalue=new KeyValue[maxSize];
        Bit=new boolean[maxSize];
        for(int i=0;i<maxSize;i++)
        {
            keyvalue[i]=null;
            Bit[i]=true;
        }
    }
    public boolean insert(T key,String name,int age)
    {
        int home=hash(key);
        int i=probe(home,key);
        if(i!=-1)
        {
            keyvalue[i]=new KeyValue<T>(key,name,age);
            Bit[i]=false;
            return true; 
        }
        return false;
    }
    private int hash(T key) {
    	  return key.hashCode()%maxSize;
	}
	int probe(int home,T key)
    {
        int i=home;
        do{
            if(keyvalue[i]==null)
                return i;
            i=(i+1)%maxSize;
        }while(i!=home);
        return -1;
    }
    public KeyValue[] getList()
    {
        return keyvalue;
    }
    public boolean delete(T key)
    {
        int home=hash(key);
        int i=home;
        do{
            if(keyvalue[i]!=null && key.equals(keyvalue[i].key))
            {
                keyvalue[i]=null;
                return true;
            }
            i=(i+1)%maxSize;
        }while(Bit[i]!=true && i!=home);
        return false;
    }
    public KeyValue find(T key)
    {
        int home=hash(key);
        int i=home;
        do{
            if(keyvalue[i]!=null && key.equals(keyvalue[i].key))
                return keyvalue[i];
            i=(i+1)%maxSize;
        }while(Bit[i]!=true&& i!=home);
        return null;
    }

}
