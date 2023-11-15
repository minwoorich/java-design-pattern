package command.배치;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        // 0. 계좌 생성 + 뱅크매니저 생성
        BankManager manager = new BankManager();
        Account[] accounts = new Account[5];
        accounts[0] = new Account("홍길동");
        accounts[1] = new Account("박길동");
        accounts[2] = new Account("김길동");
        accounts[3] = new Account("정길동");
        accounts[4] = new Account("오길동");

        // 1. 명령 전 잔액 조회
        System.out.println("명령 전 잔액 조회");
        Arrays.stream(accounts).map(Display::new).forEach(manager::run);

        for (Account account : accounts) {
            manager.run(new Display(account));
        }
        System.out.println("-----------------------------------------");

        // 2. 예약 전송, 출금 (커맨드 등록)
        manager.registerCommands(new Deposit(accounts[0],4000L)); // 홍길동, 입금
        manager.registerCommands(new Withdraw(accounts[1],5000L)); // 박길동, 출금
        manager.registerCommands(new Deposit(accounts[2],3000L)); // 김길동, 입금
        manager.registerCommands(new Withdraw(accounts[3],1000L)); // 정길동, 출금
        manager.registerCommands(new Deposit(accounts[4],4000L)); // 오길동, 입금

        // 3. 전송 시작
        manager.runAll();

        // 4. 명령 후 잔액 조회
        System.out.println("명령 후 잔액 조회");
        Arrays.stream(accounts)
                .map(Display::new)
                .forEach(manager::run);

    }
}
