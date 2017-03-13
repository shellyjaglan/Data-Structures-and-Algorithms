import java.util.*;

class PallindromeIB{
	public static void main(String[] args) {
		PallindromeIB obj = new PallindromeIB();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		//System.out.println(obj.isPalindrome(s));

		System.out.println(obj.isPalindrome2(s));
	}

	public int isPalindrome2(String s){
		StringBuffer sb = new StringBuffer();

		for(int i=0 ; i<s.length() ; i++){
			char ch = s.charAt(i);
			if(ifDigit(ch) == true || ifNumeric(ch) == true){
				sb.append(ch);
			}
		}
		int j,i;
		System.out.println("sb is: "+sb);
		for(i=0,j=sb.length()-1 ; i<j ; i++,j--){
			if(sb.charAt(i) == sb.charAt(j) || Math.abs((int)sb.charAt(i) - (int)sb.charAt(j)) == 32){
				continue;
			}
			else{
				return 0;
			}
		}
		return 1;
	}
	public boolean isPalindrome(String a) {
	    int len = a.length();
	    int i,j,flag = 1;
	    for(i=0,j=len-1 ; i<j ; ){
	        char ci = a.charAt(i);
	        char cj = a.charAt(j);
	        System.out.println("ci is : "+ci);
	        System.out.println("cj is: "+cj);
	        if(ifDigit(ci) == true || ifNumeric(ci) == true && 
	            ifDigit(cj) == true || ifNumeric(cj) == true) {
	        		flag = 0;
	        		System.out.println("in if: " + "i is: "+i+"j is: "+j);
	                if(ci == cj){
	                    i++;
	                    j--;
	                    continue;
	                }
	                else{
	                    return false;
	                }
            }
            else{
            	System.out.println("in else");
                if(ifDigit(ci) == false && ifNumeric(ci) == false){
                	System.out.println("in i worng");
                    while(i <j){
                        if(ifDigit(ci) == true || ifNumeric(ci) == true){
                            break;
                        }
                        else{
                            i++;
                        }
                    }
                }
                if(ifDigit(cj) == false && ifNumeric(cj) == false){
                	System.out.println("in z wrong");
                    while(j > i){
                        if(ifDigit(cj) == true || ifNumeric(cj) == true){
                            break;
                        }
                        else{
                            j--;
                        }
                    }
                    System.out.println("j is: "+j);
                }
            }
	    }
	    if(flag == 1){
	    	return false;
	    }
	    else
	   		return true;
	}

	boolean ifDigit(char ch){
		System.out.println("in isdigit..ch is: "+ch);
		int val = (int)ch;
		if(val >= 48 && val <=  56){
			return true;
		}
		else{
			return false;
		}
	}

	boolean ifNumeric(char ch){
		System.out.println("in isnumeric..ch is: "+ch);
		int val = (int) ch;
		if(val >= 65 && val <= 90 ||
			 val >= 97 &&  val <= 122){
			return true;
		}
		else{
			return false;
		}
	}
}