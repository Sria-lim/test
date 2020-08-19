public class Demo {
    public static void main(String[] args) {
        int n1 = 20, n2 = 40, n3 = 30 ,n4=10;
        int res = (n1 < n2 && n1 < n3&& n1<n4) ? n1 : ((n2 < n3 && n2 < n1&& n2<n4) )? n2:((n3<n4 && n3<n1 &&n3<n2) ? n3:n4);
        System.out.println("smallest of three number is:" + res);
    }

    }


