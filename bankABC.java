import java.util.Scanner;
public class bankABC {
    public static void user(String user) {
        //"Bayu Saputra", "Yolanda Anastasya", "Shanti Purnama Sari", "Fatimah Anugrah", "Roni Alexander"
        int saldo;
        switch (user) {
            case "Bayu Saputra": {
                System.out.println("Jumlah saldo anda : Rp.");
                break;
            }
            case "Yolanda Anastasya": {
                System.out.println("Jumlah saldo anda : Rp.");
                break;
            }
            case "Shanti Purnama Sari": {
                System.out.println("Jumlah saldo anda : Rp.");
                break;
            }
            case "Fatimah Anugrah": {
                System.out.println("Jumlah saldo anda : Rp.");
                break;
            }
            case "Roni Alexander": {
                System.out.println("Jumlah saldo anda : Rp.");
                break;
            }
            default:
                System.out.println("Maaf Input anda salah");
                break;
        }
    }

    public static int saldo(int saldo) {
        int pembelian;
        switch (saldo) {
            case 11500000: {
                System.out.println(saldo);
                break;
            }
            case 5800000: {
                System.out.println(saldo);
                break;
            }
            case 14500000: {
                System.out.println(saldo);
                break;
            }
            case 3800000: {
                System.out.println(saldo);
                break;
            }
            case 8800000: {
                System.out.println(saldo);
                break;
            }
            default:
                System.out.println("error");
                break;
        }
        return saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your name :\n" +
                "(Bayu Saputra, Yolanda Anastasya, Shanti Purnama Sari, Fatimah Anugrah, Roni Alexander)");
        String nama = sc.nextLine( );
        System.out.println("MENU :\n 1.\t cek saldo\n" +
                " 2.\t bayar token listrik\n 3.\t pembelian pulsa" +
                " silakan pilih opsi anda :"); // gunakan angka awal
        int opsi = sc.nextInt( );
        switch (opsi) {
            case 1:
                System.out.println("Cek saldo ?");
                String cek = sc.next( );
                //hanya menggunakan "yes" dan "no" saja
                if (nama.equals("Bayu Saputra") && (cek.equals("yes"))) {
                    user("Bayu Saputra");
                    saldo(11500000);
                } else if (nama.equals("Yolanda Anastasya") && (cek.equals("yes"))) {
                    user("Yolanda Anastasya");
                    saldo(5800000);
                } else if (nama.equals("Shanti Purnama Sari") && (cek.equals("yes"))) {
                    user("Shanti Purnama Sari");
                    saldo(14500000);
                } else if (nama.equals("Fatimah Anugrah") && (cek.equals("yes"))) {
                    user("Fatimah Anugrah");
                    saldo(3800000);
                } else if (nama.equals("Roni Alexander") && (cek.equals("yes"))) {
                    user("Roni Alexander");
                    saldo(8800000);
                } else {
                    System.out.println("Maaf input anda salah");
                }
                break;
            case 2:
                System.out.println("bayar token listrik?");
                String membeli = sc.next( );
                System.out.println("anda akan membeli token listrik Rp.100000");
                String bayar = sc.next( );
                if (nama.equals("Bayu Saputra") && (bayar.equals("yes"))) {
                    user("Bayu Saputra");
                    int total;
                    total = 11500000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Yolanda Anastasya") && (bayar.equals("yes"))) {
                    user("Yolanda Anastasya");
                    int total;
                    total = 5800000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Shanti Purnama Sari") && (bayar.equals("yes"))) {
                    user("Shanti Purnama Sari");
                    int total;
                    total = 14500000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Fatimah Anugrah") && (bayar.equals("yes"))) {
                    user("Fatimah Anugrah");
                    int total;
                    total = 3800000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Roni Alexander") && (bayar.equals("yes"))) {
                    user("Roni Alexander");
                    int total;
                    total = 8800000 - 10000;
                    System.out.println(total);
                } else {
                    System.out.println("Maaf input anda salah");
                }
                break;
            case 3:
                System.out.println(" pembelian pulsa");
                String beli = sc.next( );
                if (nama.equals("Bayu Saputra") && (beli.equals("yes"))) {
                    user("Bayu Saputra");
                    int total;
                    total = 11500000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Yolanda Anastasya") && (beli.equals("yes"))) {
                    user("Yolanda Anastasya");
                    int total;
                    total = 5800000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Shanti Purnama Sari") && (beli.equals("yes"))) {
                    user("Shanti Purnama Sari");
                    int total;
                    total = 14500000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Fatimah Anugrah") && (beli.equals("yes"))) {
                    user("Fatimah Anugrah");
                    int total;
                    total = 3800000 - 10000;
                    System.out.println(total);
                } else if (nama.equals("Roni Alexander") && (beli.equals("yes"))) {
                    user("Roni Alexander");
                    int total;
                    total = 8800000 - 10000;
                    System.out.println(total);
                }else {
                        System.out.println("Maaf input anda salah");
                    }
                break;
                }
        }
    }