package JavaLec4;

public class patterns {
    public static void main(String[] args) {
        // for(int line = 1; line<=4; line++ ){
        //     for(int star=1;star<=line;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //     //output
        //     //*
        //     //**
        //     //***
        //     //****
        // }


        // int n=4;
        // for(int line = 1; line<=n; line++ ){  
        //     for(int star=1;star<=n-line+1;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //output
        //****
        //***
        //**
        //*


        //half pyramid pattern
        // int m=4;
        // for(int line = 1; line<=m; line++ ){
        //     //numbers print
        //     for(int num=1;num<=line;num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }

        //Character pattern
        int j=4;
        char ch = 'A';
        //outer loop
        for(int line = 1; line<=j; line++ ){
            //inner loop
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

            //output
            //A
            //BC
            //DEF
            //GHIJ
        }
    }
}
