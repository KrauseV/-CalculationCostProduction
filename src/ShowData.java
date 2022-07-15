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
    public void AvailableMachines(MachineData machineData) {
        for (int i = 0; i < machineData.name.length; i++) {
            System.out.println(machineData.name[i]+" Мощность от "+machineData.power[i][0] + " до "+
                    machineData.power[i][machineData.power[i].length-1] );
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
        String[] name = result.getName();
        int[] indexes = result.getIndexes();
        int[] unit = result.getUnit();
        Unit[] units = result.getUnits();
        int sum=0;
        for (int i = 0; i <=result.getIndexes().length-1; i++) {
            if (name[i] != null) {
                stringBuilder.append(name[i]).append(space);
                stringBuilder.append(rules).append(units[unit[i]].power[indexes[i]]).append(" Вт.");
                stringBuilder.append(cost).append(units[unit[i]].cost[indexes[i]]).append("р.");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
                sum+=units[i].cost[indexes[i]];
            }
        }
        System.out.println("Общие затраты = " + sum + "Руб.");
    }
}
