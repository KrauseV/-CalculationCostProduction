

public class Calculation {
    Unit[] units;
    int task;
    int sum = Integer.MAX_VALUE;
    Result result;
    int[][] sumSum;

    public void setSignature(Unit[] units, String task) {
        this.task = Integer.parseInt(task);
        this.units = units;
        sumSum = new int[2][units.length];
        result = new Result();
    }

    public Result compute() {
        for (int i = 0; i < units.length; i++) {
            Calc(i);
        }
        result.setUnits(units);
        return result;
    }


    private void Calc(int count) {
        for (int j = 0; j < units[count].power.length; j++) {
            sumSum[0][count] = count;
            sumSum[1][count] = j;
            if (count != units.length - 1) {
                Calc(++count);
                count--;
            }
            if (count == units.length - 1) Sum();
        }
    }

    private void Sum() {
        int power = 0;
        int money = 0;
        for (int i = 0; i < sumSum[0].length; i++) {
            power += units[sumSum[0][i]].power[sumSum[1][i]];
            money += units[sumSum[0][i]].cost[sumSum[1][i]];
            if (power == task && money < sum) {
                result = resultFoo(money, i);
                break;
            }
        }
    }

    private Result resultFoo(int many, int count) {
        sum = many;
        Result result = new Result();
        result.setLength(count + 1);
        for (int i = 0; i <= count; i++) {
            result.setIndexes(sumSum[1][i], i);
            result.setName(units[i].name, i);
            result.setUnit(sumSum[0][i], i);
        }
        return result;
    }
}

