/*
 * creedengo - Java language - Provides rules to reduce the environmental footprint of your Java programs
 * Copyright © 2024 Green Code Initiative (https://green-code-initiative.org/)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.greencodeinitiative.creedengo.java.checks;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

class GCI69AvoidGettingSizeCollectionInForLoopBad {
    AvoidGettingSizeCollectionInForLoopBad() {

    }

    public void badForLoop() {
        final List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(20);

        final Iterator<Integer> it = numberList.iterator();
        for (; it.hasNext(); ) { // Ignored => compliant
            System.out.println(it.next());
        }
    }
}
