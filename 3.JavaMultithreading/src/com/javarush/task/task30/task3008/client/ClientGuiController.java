package com.javarush.task.task30.task3008.client;

public class ClientGuiController extends Client {

    ClientGuiModel model = new ClientGuiModel();
    ClientGuiView view = new ClientGuiView(new ClientGuiController());

    @Override
    protected SocketThread getSocketThread() {
        return new GuiSocketThread();
    }

    @Override
    public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.run();
    }

    @Override
    protected String getServerAddress() {
        return view.getServerAddress();
    }

    @Override
    protected int getServerPort() {
        return view.getServerPort();
    }

    @Override
    protected String getUserName() {
        return view.getUserName();
    }

    public class GuiSocketThread extends SocketThread {

        @Override
        protected void processIncomingMessage(String message) {
            super.processIncomingMessage(message);
        }

        @Override
        protected void informAboutAddingNewUser(String userName) {
            super.informAboutAddingNewUser(userName);
        }

        @Override
        protected void informAboutDeletingNewUser(String userName) {
            super.informAboutDeletingNewUser(userName);
        }

        @Override
        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            super.notifyConnectionStatusChanged(clientConnected);
        }
    }
}
