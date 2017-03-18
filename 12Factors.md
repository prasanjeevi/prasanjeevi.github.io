# 12 Factors

## 1. Codebase
  > One codebase tracked in revision control, many deploys
  * git
  * Isolate code from [dependencies](#2.dependencies) and configuration
  * Ignore unnecessary files / folders when pushing
    * use `.gitignore` `.cfignore`
    ```
     .DS_Store
     bin
     obj
     project.lock.json
     node_modules
     .vs
     .vscode
    ```
  * One codbase per microservice

## 2. Dependencies
  > Explicitly declare and isolate dependencies
  * npm, bower, nuget, gradle, maven

## 3. Config
  > Store config in the environment
  * Use configuration servers

.NET Core references a particular environment variable, `ASPNETCORE_ENVIRONMENT` to describe the environment the application is currently running in. This variable can be set to any value you like, but three values are used by convention: `Development`, `Staging` and `Production`
    
`appsettings.Development.json`, `appsettings.Staging.json`, `appsettings.Production.json`

`NODE_ENV` is an environment variable made popular by the express webserver framework.

## 4. Backing services
  > Treat backing services as attached resources
  * A backing service is any service the app consumes over the network as part of its normal operation
  * Databases, Queues, External services
  * `cf bind-service myapp mybackingservice`
  * For bindable services, Cloud Foundry adds connection details to the `VCAP_SERVICES` environment variable

## 5. Build, release, run
  > Strictly separate build and run stages
  * build: code + dependencies -> binary
  * release: build + configuration
  * run: execution
  * Have rollback plan
  * Don't do live edit

## 6. Processes
  > Execute the app as one or more stateless processes


## 7. Port binding
  > Export services via port binding
  * In case of node use `process.env.PORT`
  * In case of .Net core use `--server.urls=http://localhost:{port}`

## 8. Concurrency
  > Scale out via the process model

## 9. Disposability
  > Maximize robustness with fast startup and graceful shutdown

## 10. Dev/prod parity
  > Keep development, staging, and production as similar as possible
  * File/Folder names are case-insensitive in Windows where as case-sensitive in linux/mac
  * Path and special folders are different
  * Use adapters

## 11. Logs
  > Treat logs as event streams
  * Dont use file logs

### Viewing logs of CF apps
  ```
  cf logs appname
  cf logs appname --recent
  ```

### Viewing logs in Azure sites
  ```
  curl -u $username:password https://sitename.scm.azurewebsites.net/api/logstream
  ```

## 12. Admin processes
  > Run admin/management tasks as one-off processes

## Reference
[12factor.net](12factor.net)

## Images
![](images/12factors.png?raw=true)
Image: dzone.com

### The Cloud-Native Architecture
![](images/12factors-cf.svg?raw=true)
Image: pivotal.io