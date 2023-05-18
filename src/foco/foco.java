package foco;

/**
 * @author HectorZl 
 * @date 05/18/2023
 */
public class foco {

    String color;
    boolean encendido;
    
    private String getColor() {
        return color;
    }
    private void setColor(String color) {
        this.color = color;
    }
    
    private String encenderfoco(){
        return "foco encendido";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        foco lampara= new foco();
        System.out.println();
    }
    
}
