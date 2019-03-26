package org;

public class Client {
    public Invoker invoker;
    public Client(){

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        invoker = new Invoker();
        invoker.setCommand(command);
        invoker.runCommand();
    }
}
