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
public class ShowData {
    public void AvailableMachines(ArrayMachineData arrayMachineData) {

        for (int i = 0; i < arrayMachineData.getName().length; i++) {
            System.out.println(arrayMachineData.getName()[i]+" Мощность от "+
                    arrayMachineData.getPower()[i][0] + " до "+
                    arrayMachineData.getPower()[i][arrayMachineData.getPower()[i].length-1] );
        }
    }
    public void ShowResult(Result result){
asString(result);
    }
    void asString(Result result) {
        StringBuilder stringBuilder = new StringBuilder();
        String space = " ";
        String rules = " установить на ";
        String cost = " затраты = ";
        int sum=0;
        for (int i = 0; i <=result.getIndexes().length-1; i++) {
            if (result.getName()[i] != null) {
                stringBuilder.append(result.getName()[i]).append(space);
                stringBuilder.append(rules).append(result.getUnits()[result.getUnit()[i]].power[result.getIndexes()[i]]).append(" Вт.");
                stringBuilder.append(cost).append(result.getUnits()[result.getUnit()[i]].cost[result.getIndexes()[i]]).append("р.");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
                sum+=result.getUnits()[i].cost[result.getIndexes()[i]];
            }
        }
        System.out.println("Общие затраты = " + sum + "Руб.");
    }
}
