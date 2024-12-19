package org.example.push;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(10);

        Observer observer1 = new ObserverImpl1();
        observable.subscribe(observer1);  //subscribe
        observable.subscribe(new ObserverImpl2());
        observable.setState(70);
        observable.setState(50);

        observable.unsubscribe(observer1);  //unsubscribe
        System.out.println("----------------------");
        observable.setState(30);

        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("###################");
                System.out.println(Math.cos(state));
                System.out.println("###################");
            }
        });

        observable.subscribe(state -> {
            System.out.println("+++++++++++++++++++");
            System.out.println(Math.sin(state));
            System.out.println("+++++++++++++++++++");
        });

        observable.setState(67);

        while (true){
            observable.setState((int)(Math.random()*7600));
        }
    }
}