/*
 * Copyright 2015 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package contra_params;

import test.A;
import test.B;

public class Main {

    public static void main(String[] args) {
        // Test contravariant methods
        TestA ta = new TestA();
        ta.foo(new B());
        ta = new TestB();
        ta.foo(new B());

        TestB tb = new TestB();
        tb.foo(new A());
    }
}
