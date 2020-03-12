 class HaveValues{
     private String waterName = "phumlani";
    public boolean empty;

    void setvalue(String waterName){
        this.waterName = waterName;
    }

    String getValue(){
     return waterName;
    }
    // String takeName(){

    //     System.out.println("the buyer name is: "+ name);
    //     return name;
    // }
}
class Waterbottle{
    public static void main(String[] args) {
        // Waterbottle waterbottle = new Waterbottle();
        HaveValues waterbottle = new HaveValues();

        System.out.println(waterbottle.empty);
        waterbottle.setvalue("Blue waters");
        

        System.out.println(waterbottle.getValue());
    }
}