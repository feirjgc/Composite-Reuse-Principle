package cn.fei;

public class StuDao extends Dbutil{
	
	//定义连接的方式jdbc连接
   private static Dbutil dbutil=new Dbutil();
    public static void main(String[] args) {
    	StuDao stuDao=new StuDao();
    	
    	stuDao.setDbutStyle(dbutil);
		
	}
    
    public void setDbutStyle(Dbutil dbutil){
    	dbutil.ConnStyle();
    }
}
