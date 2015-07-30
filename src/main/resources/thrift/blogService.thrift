namespace java com.blog.finagle.thrift.blogService

include "result.thrift"

service BlogService{
    /*desc 检测用户名密码的正确性
      param username 用户名 password 密码
     */
    result.BooleanResult isRightUser(1:string username,2:string password);
}