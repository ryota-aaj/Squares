//�@���p�f�[�^��  x[]={0.0,0.2,0.4,0.6,0.8,1.0,1.2}
//           y[]={3.3,6.8,10.0,12.8,16.8,19.9,23.0}�@�𗘗p���A
//    theta[0] = 3.362349701006411 , theta[1] = 16.44401300913648�@�𓾂��B
// Excel�ŗ��_�l�����߂�ƁA
//    theta[0] = 3.360714 , theta[1] = 16.44643
// �ƂȂ�A�قړ������ʂƂȂ��� �B

package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x[]={0.0,0.2,0.4,0.6,0.8,1.0,1.2};
		double y[]={3.3,6.8,10.0,12.8,16.8,19.9,23.0};
		double theta[]=new double[2];

		Squares_lib slib = new Squares_lib(x,y);
		
		for(int i = 0; i < 100; i++){
			 theta = slib.getDx();
			 System.out.println(i+" : theta[0] = "+theta[0]);
			 System.out.println(i+" : theta[1] = "+theta[1]);
			 System.out.println(i+" : Objective function = "+slib.getRx());
	 }

	
	}

}
