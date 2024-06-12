public class ExceptionHandling 
{
    public static void main(String[]args)throws Exception
    {
        try{
            throw new userDefined();        
        }
        catch(Throwable e)
        {
            System.out.println("Exception: "+e);
        }
        finally{
            System.out.println("Exception Resolved");
        }
    }    
}
class userDefined extends Exception
{
    public String toString(){
    return "User-Defined Exception Thrown";
    }
}
