# dotnet CLI

### Working with CLI
```
dotnet --help
.NET Command Line Tools (1.0.1)
...
Templates                 Short Name      Language      Tags
----------------------------------------------------------------------
Console Application       console         [C#], F#      Common/Console
Class library             classlib        [C#], F#      Common/Library
Unit Test Project         mstest          [C#], F#      Test/MSTest
xUnit Test Project        xunit           [C#], F#      Test/xUnit
ASP.NET Core Empty        web             [C#]          Web/Empty
ASP.NET Core Web App      mvc             [C#], F#      Web/MVC
ASP.NET Core Web API      webapi          [C#]          Web/WebAPI
Solution File             sln                           Solution

Examples:
    dotnet new mvc --auth None --framework netcoreapp1.1
    dotnet new xunit --framework netcoreapp1.1
    dotnet new --help
```

```
dotnet --version
1.0.4
```
```
dotnet

Microsoft .NET Core Shared Framework Host

  Version  : 1.1.0
  Build    : 928f77c4bc3f49d892459992fb6e1d5542cb5e86

Usage: dotnet [common-options] [[options] path-to-application]

Common Options:
  --help                           Display .NET Core Shared Framework Host help.

  --version                        Display .NET Core Shared Framework Host versi
on.

Options:
  --fx-version <version>           Version of the installed Shared Framework to
use to run the application.
  --additionalprobingpath <path>   Path containing probing policy and assemblies
 to probe for.

Path to Application:
  The path to a .NET Core managed application, dll or exe file to execute.

If you are debugging the Shared Framework Host, set 'COREHOST_TRACE' to '1' in y
our environment.

To get started on developing applications for .NET Core, install the SDK from:
  http://go.microsoft.com/fwlink/?LinkID=798306&clcid=0x409
```
## sln file
### Solution file created using dotnet cli
```
Microsoft Visual Studio Solution File, Format Version 12.00
# Visual Studio 15
VisualStudioVersion = 15.0.26124.0
MinimumVisualStudioVersion = 15.0.26124.0
Global
	GlobalSection(SolutionConfigurationPlatforms) = preSolution
		Debug|Any CPU = Debug|Any CPU
		Debug|x64 = Debug|x64
		Debug|x86 = Debug|x86
		Release|Any CPU = Release|Any CPU
		Release|x64 = Release|x64
		Release|x86 = Release|x86
	EndGlobalSection
	GlobalSection(SolutionProperties) = preSolution
		HideSolutionNode = FALSE
	EndGlobalSection
EndGlobal
```
### Solution file created using VisualStudio 2017
```
Microsoft Visual Studio Solution File, Format Version 12.00
# Visual Studio 15
VisualStudioVersion = 15.0.26228.4
MinimumVisualStudioVersion = 10.0.40219.1
Global
	GlobalSection(SolutionProperties) = preSolution
		HideSolutionNode = FALSE
	EndGlobalSection
EndGlobal
```
## Step by step

### Solution creation
```
mkdir CodeFactory.Codebase
cd CodeFactory.Codebase
dotnet new sln

git init
git add .
git commit -m "added empty sln file"
git remote add origin https://github.com/prasanjeevi/codebase.net.git
git push -u origin master
```
### console project
```
mkdir CodeFactory.Codebase.Cli
cd CodeFactory.Codebase.Cli
dotnet new console

cd ..
dotnet sln add CodeFactory.Codebase.Cli\CodeFactory.Codebase.Cli.csproj

dotnet restore
dotnet run --project CodeFactory.Codebase.Cli/CodeFactory.Codebase.Cli.csproj

git add .
git commit -m "added console project"
git push -u origin master
```
### webapi project
```
mkdir CodeFactory.Codebase.Services
cd ClCodeFactory.Codebase.Services
dotnet new webapi

cd ..
dotnet sln add CodeFactory.Codebase.Services\CodeFactory.Codebase.Services.csproj

dotnet restore
cd CodeFactory.Codebase.Services
dotnet run CodeFactory.Codebase.Services/CodeFactory.Codebase.Services.csproj

git add .
git commit -m "added webapi project"
git push -u origin master
```
### mvc project
```
mkdir CodeFactory.Codebase.Web
cd ClCodeFactory.Codebase.Web
dotnet new mvc

cd ..
dotnet sln add CodeFactory.Codebase.Cli.Web\CodeFactory.Codebase.Web.csproj

cd CodeFactory.Codebase.Web
dotnet restore
dotnet run

git add .
git commit -m "added web project"
git push -u origin master
```
### classlib project
```
mkdir CodeFactory.Codebase.Contracts
cd CodeFactory.Codebase.Contracts
dotnet new classlib

dotnet restore
dotnet build

dotnet add reference ..\CodeFactory.Codebase.Contracts\CodeFactory.Codebase.Contracts.csproj

cd ..
dotnet sln add CodeFactory.Codebase.Contracts\CodeFactory.Codebase.Contracts.csproj

git add .
git commit -m "added contract project, people"
git push -u origin master
```
