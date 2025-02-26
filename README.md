<h1 align="center">Spring Security Guide</h1>

# Introduce
Hi this repository is a guide for spring security in case anyone has any doubts or me :D.

# Domain
Domain package is simple, package entity contains user entity for user login in application and enum package contains userRole.

# Repository
handle userdetails by username in repository class of user.

# Services
UserService - have three methods loadUserByUsername, registerUserInDatabase and deleteUser.
deleteUser only for admin role for tests!

# Controller
SecurityController - have three endpoints "auth/login", "auth/register" and "/auth/delete"
# Config
SecurityConfig - contains spring security configuration example: filterChain and set endpoints permissions role and others filter and injectable dependency!
# Exceptions
BaseException - is an abstract class for default exception child.
InvalidUserException - has occurred any error of user.
# Security
JwtGenerator - contains validator and generate jwt token!
SecurityConstants - contains private key for jwt api, but I don't recommend private key always in env file or storage in safe location.
SecurityJwtFilter - authenticate user by jwt token when user request an auth;
# For More Details
For more details please read class comment!
# License
this project is under of MIT License. for more details read License file.