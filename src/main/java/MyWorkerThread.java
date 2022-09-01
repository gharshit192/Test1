
public class MyWorkerThread implements Runnable {
    private String name;

    public MyWorkerThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start Name ->" + "  " + name);
        processMessage(name);
        System.out.println(Thread.currentThread().getName() + "End");
    }

    private void processMessage(String name) {
        try {
            if (checkPalindromeOfString(name)) {
                System.out.println(name + " Is A Palindrome ");
            } else {
                System.out.println(name + " Is Not A Palindrome ");
            }
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Boolean checkPalindromeOfString(String name) {
        System.out.println("Check If " + name + " is Palindrome Or Not");
        String rev = "";
        if (name.length() <= 0) {
            throw new RuntimeException("Invalid Name");
        }
        int lengthOfName = name.length();
        for (int i = (lengthOfName - 1); i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        return name.equalsIgnoreCase(rev);
    }

}

