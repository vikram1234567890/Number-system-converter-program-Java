
package numbersystemconverter;



import java.util.Arrays;

public class NumSysCalculation  extends NumSysCon{
    private String bin[]=new String[100],dec[]=new String[100],oct[]=new String[100],hex[]=new String[100],stringNumber="",array[]=new String[100],strBin="",strDec="",strOct="",strHex="";
    private int numberCount,j=0;
    private boolean minusChar=false;


    private void output(String array[],String type)
    {
        stringNumber="";

        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=null)

                stringNumber=stringNumber+array[i];

            else break;
        }
        System.out.println(type+" "+stringNumber);

    }

    void  nsParser(String s,int index)
    {
        j=0;
        String temp = "";

        Arrays.fill(array,null);
        for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {

                    i = i + 2;

                }

            temp = temp + String.valueOf(s.charAt(i));
        }
        s=temp;
        for (int i=0;i<s.length() ;i++)
        {

            if(array[j]!=null) {
                if (s.charAt(i) == '(' || stringNumber.contains("(")) {
                    stringNumber = "";
                    j = j + 1;
                } else if (s.charAt(i) == ')' || stringNumber.contains(")")) {
                    stringNumber = "";
                    j = j + 1;
                } else if (s.charAt(i) == '^' || stringNumber.contains("^")) {
                    stringNumber = "";
                    j = j + 1;
                } else if (s.charAt(i) == '/' || stringNumber.contains("/")) {
                    stringNumber = "";
                    j = j + 1;
                } else if (s.charAt(i) == '*' || stringNumber.contains("*")) {
                    stringNumber = "";
                    j = j + 1;
                } else if (s.charAt(i) == '+' || stringNumber.contains("+")) {
                    stringNumber = "";
                    j = j + 1;
                } else if (i != 0 && s.charAt(i) == '-') {
                    stringNumber = "";
                    j = j + 1;
                }
            }
            for(;j<array.length;)
            {
                stringNumber=stringNumber+String.valueOf(s.charAt(i));
                array[j]=stringNumber;
                break;
            }

        }

        for (int i=0;i<array.length;i++)
        {
            if(array[i]!=null)
            {
                if (index == 1)
                {
                    dec[i]=array[i];
                    oct[i]=array[i];
                    hex[i]=array[i];
                    if(!array[i].contains("(") && !array[i].contains(")") && !array[i].contains("^") && !array[i].contains("/") && !array[i].contains("*") && !array[i].contains("+") && !array[i].equals("-"))
                    {
                        dec[i]="";
                        oct[i]="";
                        hex[i]="";
                        if (array[i].contains("-"))
                        {
                            array[i]=array[i].replace("-","").trim();
                            minusChar=true;
                        }


                        if (minusChar==true) {
                            minusChar=false;
                            dec[i] ="-"+toDec(array[i],2);
                            oct[i] = "-"+decto(dec[i].replace("-","").trim(), 8);
                            hex[i] = "-"+decto(dec[i].replace("-","").trim(), 16);
                        }
                        else
                        {
                            dec[i] =toDec(array[i],2);
                            oct[i] = decto(dec[i], 8);
                            hex[i] = decto(dec[i], 16);
                        }
                    }

                }
                if (index ==2)
                {
                    bin[i]=array[i];
                    oct[i]=array[i];
                    hex[i]=array[i];
                    if(!array[i].contains("(") && !array[i].contains(")") && !array[i].contains("^") && !array[i].contains("/") && !array[i].contains("*") && !array[i].contains("+") && !array[i].equals("-"))
                    {

                        bin[i]="";
                        oct[i]="";
                        hex[i]="";
                        if (array[i].contains("-"))
                        {
                            array[i]=array[i].replace("-","").trim();
                            minusChar=true;
                        }

                        if (minusChar==true) {
                            minusChar=false;
                            oct[i] ="-"+decto(array[i],8);
                            bin[i] = "-"+decto(array[i],2);
                            hex[i] = "-"+decto(array[i],16);
                        }
                        else
                        {
                            bin[i]=decto(array[i],2);
                            oct[i]=decto(array[i],8);
                            hex[i]=decto(array[i],16);
                        }


                    }

                }
                if (index == 3)
                {
                    dec[i]=array[i];
                    bin[i]=array[i];
                    hex[i]=array[i];
                    if(!array[i].contains("(") && !array[i].contains(")") && !array[i].contains("^") && !array[i].contains("/") && !array[i].contains("*") && !array[i].contains("+") && !array[i].equals("-"))
                    {

                        dec[i]="";
                        bin[i]="";
                        hex[i]="";
                        if (array[i].contains("-"))
                        {
                            array[i]=array[i].replace("-","").trim();
                            minusChar=true;
                        }


                        if (minusChar==true) {
                            minusChar=false;
                            dec[i] ="-"+toDec(array[i],8);
                            bin[i] = "-"+decto(dec[i].replace("-","").trim(), 2);
                            hex[i] = "-"+decto(dec[i].replace("-","").trim(), 16);
                        }
                        else
                        {
                            dec[i] =toDec(array[i],8);
                            bin[i]=decto(dec[i],2);
                            hex[i]=decto(dec[i],16);
                        }


                    }

                }
                if (index == 4)
                {
                    dec[i]=array[i];
                    oct[i]=array[i];
                    bin[i]=array[i];
                    if(!array[i].contains("(") && !array[i].contains(")") && !array[i].contains("^") && !array[i].contains("/") && !array[i].contains("*") && !array[i].contains("+") && !array[i].equals("-"))
                    {

                        dec[i]="";
                        oct[i]="";
                        bin[i]="";
                        if (array[i].contains("-"))
                        {
                            array[i]=array[i].replace("-","").trim();
                            minusChar=true;
                        }


                        if (minusChar==true) {
                            minusChar=false;
                            dec[i] ="-"+toDec(array[i],16);
                            oct[i] = "-"+decto(dec[i].replace("-","").trim(), 8);
                            bin[i] = "-"+decto(dec[i].replace("-","").trim(), 2);
                        }
                        else
                        {
                            dec[i] =toDec(array[i],16);
                            oct[i]=decto(dec[i],8);
                            bin[i]=decto(dec[i],2);
                        }


                    }

                }
            }
            else
                break;
        }
        if(index==1)//bin 
        {
            output(dec,"bin to dec");
            output(oct,"bin to oct");
            output(hex,"bin to hex");
        }
        if(index==2)//dec
        {
            output(bin,"dec to bin");
            output(oct,"dec to oct");
            output(hex,"dec to hex");
        }
        if(index==3)//oct
        {
            output(dec,"oct to dec");
            output(bin,"oct to bin");
            output(hex,"oct to hex");
        }
        if(index==4)//hex
        {
            output(dec,"hex to dec");
            output(oct,"hex to oct");
            output(bin,"hex to bin");
        }

    }

}
