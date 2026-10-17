public class BaseComponent {
    protected static IMediator mediator;

    public BaseComponent(IMediator mediator){
        this.mediator = mediator;
    }

    public void setMediator(IMediator mediator){
        this.mediator = mediator;
    }
}
