package Testing;

public class numbers {

static String str = "ABH@,123CKL9";
int i;

public static void main (String[] arg)
{

StringBuffer alpha= new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

for(int i= 0; i<str.length(); i++)
{

if(Character.isAlphabetic(str.charAt(i)))
alpha.append(str.charAt(i));

else if(Character.isDigit(str.charAt(i)))
num.append(str.charAt(i));

else

	special.append(str.charAt(i));
}
{
System.out.println("Alpabetic character:"+ alpha);

System.out.println("Numeric character:"+num);

System.out.println("Special character:"+special);
}
}
}