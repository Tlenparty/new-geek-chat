import chat.MyServer;

import java.io.IOException;

public class ServerApp {

    public static final int DEFAULT_PORT = 8189;

    public static void main(String[] args) {
        int port = DEFAULT_PORT;
        if(args.length != 0){
            port = Integer.parseInt(args[0]);
        }

        // 1. Запуск сервера. Принимаем порт и прокидываем на майсервер
        try {
            new MyServer(port).start();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка");
            System.exit(1); // Выход из программы
        }

    }

}
