package cn.fei;

public class StuDao extends Dbutil{
	
	//�������ӵķ�ʽjdbc����
   private static Dbutil dbutil=new Dbutil();
    public static void main(String[] args) {
    	StuDao stuDao=new StuDao();
    	
    	stuDao.setDbutStyle(dbutil);
		
	}
    
    public void setDbutStyle(Dbutil dbutil){
    	dbutil.ConnStyle();
    }
}
