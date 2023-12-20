class athread extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread A"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
    public static void main(String args[])
    {
        athread p=new athread();
        p.start();
    }
}