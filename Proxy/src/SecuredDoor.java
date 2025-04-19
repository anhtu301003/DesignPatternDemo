public class SecuredDoor implements Door{
    private Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    @Override
    public void open(String password) {
        if(authentica(password)){
            door.open("");
        }else {
            System.out.println("Big no! It ain't possible");
        }
    }

    private boolean authentica(String password){
        return "matkhau".equals(password);
    }

    @Override
    public void close() {
        door.close();
    }
}
