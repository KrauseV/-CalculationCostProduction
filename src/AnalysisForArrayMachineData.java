/*
 *  Copyright [2022] [KrauseV]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import java.util.Arrays;

public class AnalysisForArrayMachineData  {
    MachineData machineData = new MachineData();
  private final int[][] power = machineData.power;
   private final int[][] cost= machineData.cost;
   private final String[] name = machineData.name;
    private int[] justPower;
    private int[] justCost;

    public AnalysisForArrayMachineData() {
       Calc();
    }

    public String[] getName() {
        return name;
    }

    public int[][] getPower() {

        return power;
    }

    public int[][] getCost() {
        return cost;
    }

    public  void Calc(){

    for (int i = 0; i < machineData.power.length; i++) {
        Analys(machineData.power[i],machineData.cost[i],i );
       }

}

    private  void Analys(int[] ints, int[] ints1, int index) {
       for (int i = 0; i <ints.length-1; i++) {
            int length = ints[i+1]-ints[i];
            int costStep = (ints1[i+1]-ints1[i])/length;
            CreatArry(length,ints,ints1,costStep,i);
            }
        cost[index]= JoinArray(justCost,cost,index);
power[index]=JoinArray(justPower,power,index);
justPower=Arrays.copyOf(justPower,0);
justCost=Arrays.copyOf(justCost,0);
    }

    private  void CreatArry(int i, int[] power, int[] cost, int costStep, int i1) {
        int[] NewPower = new int[i];
        int[] NewCost = new int[i];
        for (int j = 0; j < NewPower.length ; j++) {
            NewPower[j]=power[i1]+j;
            NewCost[j]=cost[i1]+costStep*j;
             }
        if(justPower==null){
      justCost=NewCost;
        justPower= NewPower;}
        else {
            justCost=Arrays.copyOf(justCost,justCost.length+NewCost.length);
            System.arraycopy(NewCost,0,justCost,justCost.length-NewCost.length,NewCost.length);
            justPower= Arrays.copyOf(justPower,justPower.length+NewPower.length);
            System.arraycopy(NewPower,0,justPower,justPower.length-NewPower.length,
                    NewPower.length);
        }
    }

    private int[] JoinArray(int[] addArray, int[][] thisArray, int index) {
   int[] newArray;
   newArray= Arrays.copyOf(addArray,addArray.length+1);
    newArray[newArray.length-1]=thisArray[index][thisArray[index].length-1];
    return newArray;
    }
}
