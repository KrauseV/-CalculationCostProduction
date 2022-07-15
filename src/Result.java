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

public class Result {
  private String[] name;
   private int[] indexes;
    private int[] unit;
    private Unit[] units;



    public Result() {
        this.name = new String[0];
        this.indexes = new int[0];
        unit = new int[0];
        units = new Unit[0];

    }
    public void setLength(int length){
        this.name = new String[length];
        this.indexes = new int[length];
        unit = new int[length];
        units = new Unit[length];
    }

    public Unit[] getUnits() {
        return units;
    }

    public void setUnits(Unit[] units) {
        this.units = units;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String name, int index) {
        this.name[index] = name;
    }

    public int[] getIndexes() {
        return indexes;
    }

    public void setIndexes(int indexes, int index) {
        this.indexes[index] = indexes;
    }

    public int[] getUnit() {
        return unit;
    }

    public void setUnit(int unit, int index) {
        this.unit[index] = unit;
    }
}
