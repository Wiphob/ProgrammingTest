public class User implements IUser {

    private String u_name = null;
    private String u_password = null;
    private int u_type = 0;
    //private String userPattern = "^[A-Za-z][A-Za-z0-9]{7,}$";
    //private String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";


    @Override
    public String getName() {
        return u_name;

    }

    @Override
    public String setName(String name) {
        if(!name.equals("null") || !name.equals(""))
            this.u_name = name;
        else{
            throw new RuntimeException("Wrong input.");
        }
        return null;
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password)){
            this.u_password = password;
            return password;
        }
        return null;
    }

    @Override
    public String getPassword() {
        return u_password;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if(!password.equals("null") || !password.equals("") || this.u_password == password) {
            return true;
        }
        else{
            throw new RuntimeException("Wrong input.");
        }
        //return false;
    }

    @Override
    public int getType() {
        return u_type;
        
    }


    public String getPassword() {
        return null;
    }

    public int setType(int type)
    {
        return null;
    }



}

