/*
* Copyright 2014 David Farrell <shokku.ra@gmail.com>
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

@SuppressWarnings("unused")
public class Sequence<E> {
    /* I wouldn't normally append to a bare array
     * but the lab project specifies E[] as the data type
     */
    protected E[] _data = null;
    protected int _size = 0;

    public Sequence() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Sequence(int capacity) {
        /* eww, type safety violation
         * but type variables can't be instantiated directly due to type erasure
         */
        _data = (E[])new Object[capacity];
    }

    public int size() {
        return _size;
    }

    public void append(E element) {

    }

    public E get(int k) throws IndexOutOfBoundsException {
        if(k < size()) {
            return _data[k];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(int k, E newElement) throws IndexOutOfBoundsException {
        if(k < size()) {
            _data[k] = newElement;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
