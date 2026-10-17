public class Component2 extends BaseComponent {
    public Component2(){
        super(mediator);
    }

    public void operasiC(){
        System.out.println("Mengeksekusi Operasi C...");
        this.mediator.notify(this, "C");
    }

    public void operasiD(){
        System.out.println("Mengeksekusi Operasi D...");
        this.mediator.notify(this, "D");
    }
}
