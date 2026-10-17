public class Component1 extends BaseComponent {
    public Component1(){
        super(mediator);
    }

    public void operasiA(){
        System.out.println("Mengeksekusi Operasi A...");
        this.mediator.notify(this, "A");
    }

    public void operasiB(){
        System.out.println("Mengeksekusi Operasi B...");
        this.mediator.notify(this, "B");
    }
}
