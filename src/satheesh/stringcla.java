package satheesh;

public class stringcla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="textabctext";
int count=0;
for(int i=1;i<a.length();i++) {
	if(a.charAt(i)=='t') {
		count++;
	}
}


//int count = 0;
//int index = a.indexOf(b);
//
//while (index != -1) {
//    count++;
//    index = a.indexOf(b, index + b.length());
//}

System.out.println(count);
	}

}
