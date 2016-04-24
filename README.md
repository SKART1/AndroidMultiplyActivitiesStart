## SimpleRecyclerViewDivider
**One Button Two Clicks Two Activities** - is an app which show that there is a possibility of receiving multiply opened activities when tapping multiply times on one button. Of course you may just add `Intent.FLAG_ACTIVITY_SINGLE_TOP` and all will work - but not always it is possible. This app illustrate such case - that in some cases you will need to, for example, manually filter user input not to meet such cases. 

Keep in mind that this project is designed to be as simple as possible - so some of the good approaches in android programming are ignored (multiply drawable for different density, different app themes and etc).


## Compilation
It is simple app. Just compile it with gradle and use

## Usage
Click speedy on big button on first activities. After some period of time you will have from 1 to 3 or more opened activities - instances of the same one class.
It will not be easy to understand how much of them have opened - so there is counter in the upper left corner of the **SecondActivity** which incremented after each instance is created


## Contributing
If you want to improve this demo app you may fork this repository and contribute back using [pull requests](https://github.com/skart1/AndroidMultiplyActivitiesStart/pulls).


## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2015 Art Koff

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```