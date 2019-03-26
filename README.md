# javademo
## 1. [hello world](hello/README.md)
## 2. [最简易http服务器](httpServer/README.md)
输出http请求信息到控制台，并返回hello到浏览器端
## 3. [spring入门](springStart/README.md)
## 4. [设计模式](GOF/README.md)
基于java类配置bean信息，初始化一个上下文，然后获取一个bean，并调用方法
```uml
@startuml
class MainActivity
note left:左侧注明用途
note right of MainActivity:右侧注明用途
note top of MainActivity:上面注明用途
note bottom of MainActivity:下面注明用途

class List<<general>>
note top of List : 接口类型,xxList extends it

class ArrayList
note left : 基于长度可变的数组的列表

note "Collection 的衍生接口和类" as NOTE
List .. NOTE
NOTE .. ArrayList

List <|-- ArrayList

Class Person
note left:左边的注释
Interface Set<<general>>
note right:右边的注释
note top of Person:Person的上边注释
@enduml
```
