namespace java com.blog.finagle.thrift.result

/*错误描述*/
struct FailDesc {
    1:string name,
    2:string failCode,
    3:string desc
}

struct Result{
    1:i32 code,
    2:optional list<FailDesc> failDescList
}

struct BooleanResult{
    1:Result result,
    2:optional bool isRight
}