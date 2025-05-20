public class Return {
    int sum(int x, int y)
    {
        int t=x+y;
        return t;
    }
    public static void main(String[] args) {
        Return obj=new Return();
        int r=obj.sum(24,76);
        System.out.println(r);
    }
}
