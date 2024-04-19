class CustomNullPointerException extends Exception{
		CustomNullPointerException(String msg){
			super(msg);
		}
	}
public class Q3 {
	
	public static void main(String[] args) {
		String str=null;
        try{
            if(str==null){
                throw new CustomNullPointerException("String value cannot be null");
            }
            else{
                System.out.println("String value is "+str);
            }
        }
        catch(CustomNullPointerException e){
            System.out.println(e);
        }

	}

}
