package ddd;

/**
 * Created by zelei.fan on 2017/3/17.
 */
public class TestStreamModel {
 
    private int id;
 
    private String name;
 
    private int grade;
 
    private int classes;
 
    private double score;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getGrade() {
        return grade;
    }
 
    public void setGrade(int grade) {
        this.grade = grade;
    }
 
    public int getClasses() {
        return classes;
    }
 
    public void setClasses(int classes) {
        this.classes = classes;
    }
 
    public double getScore() {
        return score;
    }
 
    public void setScore(double score) {
        this.score = score;
    }
 
    @Override
    public String toString() {
        return "TestStreamModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", classes=" + classes +
                ", score=" + score +
                '}';
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        TestStreamModel that = (TestStreamModel) o;
 
        if (id != that.id) return false;
        if (grade != that.grade) return false;
        if (classes != that.classes) return false;
        if (Double.compare(that.score, score) != 0) return false;
        return !(name != null ? !name.equals(that.name) : that.name != null);
 
    }
 
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + grade;
        result = 31 * result + classes;
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    //一致性成本，不一致成本 预防的成本 纠正的成本，零缺陷支付，第一次就把工作作对总是比较便宜的，一次搞明白问题比多次更重要，质量是设计出来的，产生于预防而非远不是不符合要求
    //的培养服务无可挑剔质量很差无可挑剔的质量，质量偏离目标越大 信噪比，信号与噪声的比值支持原生，信噪比的误差不能超过俩毫米角度不能超过俩度，声音的赔偿的物品
    //成本
}