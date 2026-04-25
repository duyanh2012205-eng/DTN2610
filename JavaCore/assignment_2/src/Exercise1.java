public class Exercise1 {
    public static void question1(Account account) {
        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + account.department.departmentName);
        }
    }

    public static void question2(Account account) {
        int count;

        if (account == null || account.groupAccounts == null) {
            count = 0;
        } else {
            count = account.groupAccounts.length;
        }

        if (account.groupAccounts == null) {
            System.out.println("Nhân viên này chưa có group");
        } else if (count == 1 || count == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (count == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    public static void question3(Account account) {
        System.out.println(account.department == null ? "Nhân viên này chưa có phòng ban." : "Phòng ban của nhân viên là: " + account.department.departmentName);
    }

    public static void question4(Account account) {
        System.out.println(account.position.positionName.toString() == "DEV" ? "Đây là Developer" : "Người này không là Developer");
    }

    public static void question5(Group group) {
        if (group.groupAccounts == null) {
            System.out.println("Group chưa có thành viên nào tham gia");
        }

        int count = group.groupAccounts.length;

        switch (count) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }

    public static void question6(Account account) {
        if (account.groupAccounts == null) {
            System.out.println("Nhân viên này chưa có group");
        }
        switch (account.groupAccounts.length) {
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }

    public static void question7(Account account) {
        String pos = account.position.positionName.toString();

        switch (pos) {
            case "DEV":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    }

    public static void question8(Account[] accounts) {
        for (Account acc : accounts) {
            System.out.println("AccountID: " + acc.accountID + " Email: " + acc.email + " Name: " + acc.fullName + " Deparment: " + acc.department.departmentName);
        }
    }

    public static void question9(Department[] depratments) {
        for (Department dep : depratments) {
            System.out.println("DepartmentID: " + dep.departmentID + " Department Name: " + dep.departmentName);
        }
    }

    public static void question10(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.departmentName);
        }
    }

    public static void question11(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentID);
            System.out.println("Name: " + departments[i].departmentName);
        }
    }

    public static void question12(Department[] departments) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Id: " + departments[i].departmentID);
            System.out.println("Name: " + departments[i].departmentName);
        }
    }

    public static void question13(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) {
                continue;
            } else {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.departmentName);
            }
        }
    }

    public static void question14(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountID < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.departmentName);
            }
        }
    }

    public static void question15() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void question16_1(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.departmentName);
            i++;
        }
    }

    public static void question16_2(Department[] departments) {
        int i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentID);
            System.out.println("Name: " + departments[i].departmentName);
            i++;
        }
    }

    public static void question16_3(Department[] departments) {
        int i = 0;
        while (i < 2) {
            System.out.println("Id: " + departments[i].departmentID);
            System.out.println("Name: " + departments[i].departmentName);
            i++;
        }
    }

    public static void question16_4(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (accounts[i].accountID < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.departmentName);
            }else {
                continue;
            }
            i++;
        }
    }

    public static void question16_5(){
        int i = 0;
        while (i <= 20 ) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }


}