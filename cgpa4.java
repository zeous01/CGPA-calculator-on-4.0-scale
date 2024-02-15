import java.util.Scanner;
public class cgpa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tProgram to calculate percentage and CGPA of a student\n");
        
        System.out.println("how many subjects you have in total");
        int n = sc.nextInt();
        float totalm=0;
        float totalc=0;
        float totalg =0;
        float totalcgpai=0;
        float[] gpa=new float [n];
        float[] marks=new float [n];
        float[] percentage=new float[n];
        float[] credithour=new float [n];
        float[] cgpai=new float [n];
        for (int i = 0; i < n; i++) {

            System.out.println("enter the marks of subject "+(i+1));
            marks[i]=sc.nextFloat();
            totalm+=marks[i];
            System.out.println("enter the credit hour of subject "+(i+1));
            credithour[i]=sc.nextFloat();
            totalc+=credithour[i];
            percentage[i]=(marks[i]/100)*100;

        if (percentage[i]>=88)
        {
            gpa[i] =4.0f;
            System.out.println("your GPA in subject "+(i+1)+" is "+gpa[i]);
        }
        else if (percentage[i]<88 && percentage[i]>=80)
        {
            gpa[i] =3.5f;
            System.out.println("your GPA in subject "+(i+1)+" is "+gpa[i]);
        }
        else if (percentage[i]<80 && percentage[i] >=75)
        {
            gpa[i] =3.0f;
            System.out.println("your GPA in subject "+(i+1)+" is "+gpa[i]);
        }
        else if (percentage[i]<75 && percentage[i] >=70)
        {
            gpa[i] =3.0f;
            System.out.println("your GPA in subject "+(i+1)+" is "+gpa[i]);
        }
        else if (percentage[i] <70 && percentage[i] >=65)
        {
            gpa[i] =2.5f;
            System.out.println("your GPA in subject "+(i+1)+" is "+gpa[i]);
        }
        else if (percentage[i] <65 && percentage[i] >=60)
        {
            gpa[i] =2.0f;
            System.out.println("your GPA in subject "+(i+1)+" is "+gpa[i]);
        }
        else
        {
            gpa[i] = 0.0f;
            System.out.println("your GPA in subject "+(i+1)+" is "+gpa[i]);
        }
        totalg+=gpa[i];
        cgpai[i]=gpa[i]*credithour[i];
        totalcgpai+=cgpai[i];

        }

        float percentaget=(totalm/(n*100.0f))*100;
        float cgpa =totalcgpai/totalc;
        System.out.println("your percentage is "+percentaget+" %\nyour CGPA is "+cgpa);
    }
}

/*
                    output
         Program to calculate percentage of a student

how many subjects you have in total
3
enter the marks of subject 1
88
enter the credit hour of subject 1
3
enter the marks of subject 2
82
enter the credit hour of subject 2
2
enter the marks of subject 3
91
enter the credit hour of subject 3
3
your percentage is 87.0 %
your CGPA is 3.875
 */