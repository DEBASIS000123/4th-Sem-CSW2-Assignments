class CustomFileNotFoundException extends Exception{
	CustomFileNotFoundException(String msg){
		super(msg);
	}
	
}
class FilereadPermissionException extends Exception{
    FilereadPermissionException(String s){
        System.out.println(s);
    }
}
public class Q4 {

	public static void main(String[] args) {
		 if (args.length == 0) {
	            System.err.println("No File Path Choosen...");
	            return;
	        }
		String filedata=args[0];
        try{
            if(filedata==null){
                throw new CustomFileNotFoundException("File is not able to excess as it is null");
            }
        }
        catch(CustomFileNotFoundException e){
            System.out.println(e);
        }
        try{
            if (filedata=="") {
                throw new FilereadPermissionException("Permission denied. Cannot read file: " + filedata);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

	}

}
