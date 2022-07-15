

public class Calculation {
    Unit[] units;
    int task;
    int sum = Integer.MAX_VALUE;
    Result result;
    int Reader=0;
    StringBuilder stringBuilder = new StringBuilder();
int[][] sumSum ;

    public void setSignature(Unit[] units, String task){
        this.task = Integer.parseInt(task);
        this.units = units;
        sumSum = new int[2][units.length];
        result = new Result(units.length);
    }
    public void compute(){
        for (int i = 0; i < units.length; i++) {
            Calc(i);
        }
    }


   private void Calc( int count) {
            for (int j = 0; j < units[count].power.length; j++) {
                sumSum[0][count]=count;
                sumSum[1][count]=j;
                if (count != units.length - 1) {
                    Calc( ++count);
                    count--;
                }
                if (count == units.length - 1) Sum();
            }
    }
private void Sum(){
        int power=0;
        int mony=0;
    for (int i = 0; i <sumSum[0].length ; i++) {
        power+=units[sumSum[0][i]].power[sumSum[1][i]];
mony+=units[sumSum[0][i]].cost[sumSum[1][i]];
        if(power==task&&mony<sum){
            Reader=i;
            result= resultFoo(mony,i);
break;
        }
    }
}
    private Result resultFoo(int many, int count){
            sum = many;
            Result result = new Result(count+1);
            for (int i = 0; i <= count; i++) {
                result.unit[i] =sumSum[0][i];
                result.name[i] = units[i].name;
                result.indexs[i] = sumSum[1][i];
            }
        return result;
    }

    void asString() {
        String space = " ";
        String rules = " установить на ";
        String cost = " затраты = ";
        for (int i = 0; i <=Reader; i++) {
            if (result.name[i] != null) {
                stringBuilder.append(result.name[i]).append(space);
                stringBuilder.append(rules).append(units[result.unit[i]].power[result.indexs[i]]).append(" Вт.");
                stringBuilder.append(cost).append(units[result.unit[i]].cost[result.indexs[i]]).append("р.");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
            }
        }
        System.out.println("Общие затраты = " + sum + "Руб.");
    }
}

