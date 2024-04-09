## 项目目标
1. Sundials在Java中调用颇为麻烦，建立一个Java调度库，方便调度
2. 使用技术方案为JNA + Jnaerator

## 技术讲解
1. JNA = JNI + 预定义动态链接库
2. Jnaerator 基于DLL+.h生成Java Library Interface
3. Sundials是常微分方程组和偏微分方程的库
    - CVODE：求解常微分方程组的明确和隐式求解器
    - CVODES：求解带灵敏度的常微分方程组的求解器
    - IDA：用于求解微分代数方程的求解器
    - IDAS：用于求解带有灵敏度分析的微分代数方程组的求解器
    - ARKODE：一种姿势因的隐式-显示方法，适用于一般刚性和非刚性问题
    - KINSOL：用于求解非线性方程组的牛顿-Krylov迭代法求解器

## 生成方法
1. java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials -mavenArtifactId jsundials -o jna_code  -package cn.catarc.jsundials -f -library sundials_arkode lib\sundials_arkode.dll include\arkode\arkode_butcher.h include\arkode\arkode.h  include\sundials\sundials_core.h -library sundials_cvode lib\sundials_cvode.dll include\cvode\cvode.h include\cvode\cvode_ls.h  include\cvode\cvode_proj.h -library sundials_kinsol lib\sundials_kinsol.dll include\kinsol\kinsol.h include\kinsol\kinsol_ls.h  include\sundials\sundials_direct.h include\sundials\sundials_iterative.h include\sundials\sundials_linearsolver.h include\sundials\sundials_matrix.h  include\sundials\sundials_nvector.h -library sundials_nvecserial lib\sundials_nvecserial.dll include\nvector\nvector_serial.h -library sundials_core  lib\sundials_core.dll include\sundials\sundials_types.h include\sundials\sundials_math.h include\sundials\sundials_direct.h  include\sundials\sundials_dense.h include\sundials\sundials_nvector.h -library sundials_sunlinsoldense lib\sundials_sunlinsoldense.dll  include\sunlinsol\sunlinsol_dense.h -library sundials_sunmatrixdense  lib\sundials_sunmatrixdense.dll include\sunmatrix\sunmatrix_dense.h
```
java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.arkode -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_arkode lib\sundials_arkode.dll include\arkode\arkode.h include\arkode\arkode_arkstep.h include\arkode\arkode_bandpre.h include\arkode\arkode_bbdpre.h include\arkode\arkode_butcher.h include\arkode\arkode_butcher_dirk.h include\arkode\arkode_butcher_erk.h include\arkode\arkode_erkstep.h include\arkode\arkode_ls.h include\arkode\arkode_mristep.h include\arkode\arkode_sprk.h include\arkode\arkode_sprkstep.h^
 -library sundials_cvode lib\sundials_cvode.dll include\cvode\cvode.h include\cvode\cvode_bandpre.h include\cvode\cvode_bbdpre.h include\cvode\cvode_diag.h include\cvode\cvode_ls.h include\cvode\cvode_proj.h^
 -library sundials_cvodes lib\sundials_cvodes.dll include\cvodes\cvodes.h include\cvodes\cvodes_bandpre.h include\cvodes\cvodes_bbdpre.h include\cvodes\cvodes_diag.h include\cvodes\cvodes_ls.h include\cvodes\cvodes_proj.h^
 -library sundials_ida lib\sundials_ida.dll include\ida\ida.h include\ida\ida_bbdpre.h include\ida\ida_ls.h^
 -library sundials_idas lib\sundials_idas.dll include\idas\idas.h include\idas\idas_bbdpre.h include\idas\idas_ls.h^
 -library sundials_kinsol lib\sundials_kinsol.dll include\kinsol\kinsol.h include\kinsol\kinsol_bbdpre.h include\kinsol\kinsol_ls.h^
 -library sundials_nvecmanyvector lib\sundials_nvecmanyvector.dll include\nvector\nvector_manyvector.h^
 -library sundials_nvecserial lib\sundials_nvecserial.dll include\nvector\nvector_serial.h^
 -library sundials_sunlinsolband lib\sundials_sunlinsolband.dll include\sunlinsol\sunlinsol_band.h^
 -library sundials_sunlinsoldense lib\sundials_sunlinsoldense.dll include\sunlinsol\sunlinsol_dense.h^
 -library sundials_sunlinsolpcg lib\sundials_sunlinsolpcg.dll include\sunlinsol\sunlinsol_pcg.h^
 -library sundials_sunlinsolspbcgs lib\sundials_sunlinsolspbcgs.dll include\sunlinsol\sunlinsol_spbcgs.h^
 -library sundials_sunlinsolspfgmr lib\sundials_sunlinsolspfgmr.dll include\sunlinsol\sunlinsol_spfgmr.h^
 -library sundials_sunlinsolspgmr lib\sundials_sunlinsolspgmr.dll include\sunlinsol\sunlinsol_spgmr.h^
 -library sundials_sunlinsolsptfqmr lib\sundials_sunlinsolsptfqmr.dll include\sunlinsol\sunlinsol_sptfqmr.h^
 -library sundials_sunmatrixband lib\sundials_sunmatrixband.dll include\sunmatrix\sunmatrix_band.h^
 -library sundials_sunmatrixdense lib\sundials_sunmatrixdense.dll include\sunmatrix\sunmatrix_dense.h^
 -library sundials_sunmatrixsparse lib\sundials_sunmatrixsparse.dll include\sunmatrix\sunmatrix_sparse.h^
 -library sundials_sunnonlinsolfixedpoint lib\sundials_sunnonlinsolfixedpoint.dll include\sunnonlinsol\sunnonlinsol_fixedpoint.h^
 -library sundials_sunnonlinsolnewton lib\sundials_sunnonlinsolnewton.dll include\sunnonlinsol\sunnonlinsol_newton.h^
 -library sundials_core lib\sundials_core.dll include\sundials\sundials_adaptcontroller.h include\sundials\sundials_band.h include\sundials\sundials_context.h include\sundials\sundials_core.h include\sundials\sundials_dense.h include\sundials\sundials_direct.h include\sundials\sundials_errors.h include\sundials\sundials_iterative.h include\sundials\sundials_linearsolver.h include\sundials\sundials_logger.h include\sundials\sundials_math.h include\sundials\sundials_matrix.h include\sundials\sundials_memory.h include\sundials\sundials_mpi_types.h include\sundials\sundials_nonlinearsolver.h include\sundials\sundials_nvector.h include\sundials\sundials_profiler.h include\sundials\sundials_types_deprecated.h include\sundials\sundials_types.h include\sundials\sundials_version.h
 
java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.arkode -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_arkode lib\sundials_arkode.dll include\arkode\arkode.h include\arkode\arkode_arkstep.h include\arkode\arkode_bandpre.h include\arkode\arkode_bbdpre.h include\arkode\arkode_butcher.h include\arkode\arkode_butcher_dirk.h include\arkode\arkode_butcher_erk.h include\arkode\arkode_erkstep.h include\arkode\arkode_ls.h include\arkode\arkode_mristep.h include\arkode\arkode_sprk.h include\arkode\arkode_sprkstep.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.cvode -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_cvode lib\sundials_cvode.dll include\cvode\cvode.h include\cvode\cvode_bandpre.h include\cvode\cvode_bbdpre.h include\cvode\cvode_diag.h include\cvode\cvode_ls.h include\cvode\cvode_proj.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.cvodes -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_cvodes lib\sundials_cvodes.dll include\cvodes\cvodes.h include\cvodes\cvodes_bandpre.h include\cvodes\cvodes_bbdpre.h include\cvodes\cvodes_diag.h include\cvodes\cvodes_ls.h include\cvodes\cvodes_proj.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.ida -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_ida lib\sundials_ida.dll include\ida\ida.h include\ida\ida_bbdpre.h include\ida\ida_ls.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.idas -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_idas lib\sundials_idas.dll include\idas\idas.h include\idas\idas_bbdpre.h include\idas\idas_ls.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.kinsol -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_kinsol lib\sundials_kinsol.dll include\kinsol\kinsol.h include\kinsol\kinsol_bbdpre.h include\kinsol\kinsol_ls.h 
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.nvecmanyvector -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_nvecmanyvector lib\sundials_nvecmanyvector.dll include\nvector\nvector_manyvector.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.nvecserial -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_nvecserial lib\sundials_nvecserial.dll include\nvector\nvector_serial.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunlinsolband -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunlinsolband lib\sundials_sunlinsolband.dll include\sunlinsol\sunlinsol_band.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunlinsoldense -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunlinsoldense lib\sundials_sunlinsoldense.dll include\sunlinsol\sunlinsol_dense.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunlinsolpcg -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunlinsolpcg lib\sundials_sunlinsolpcg.dll include\sunlinsol\sunlinsol_pcg.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunlinsolspbcgs -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunlinsolspbcgs lib\sundials_sunlinsolspbcgs.dll include\sunlinsol\sunlinsol_spbcgs.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunlinsolspfgmr -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunlinsolspfgmr lib\sundials_sunlinsolspfgmr.dll include\sunlinsol\sunlinsol_spfgmr.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunlinsolspgmr -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunlinsolspgmr lib\sundials_sunlinsolspgmr.dll include\sunlinsol\sunlinsol_spgmr.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunlinsolsptfqmr -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunlinsolsptfqmr lib\sundials_sunlinsolsptfqmr.dll include\sunlinsol\sunlinsol_sptfqmr.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunmatrixband -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunmatrixband lib\sundials_sunmatrixband.dll include\sunmatrix\sunmatrix_band.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunmatrixdense -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunmatrixdense lib\sundials_sunmatrixdense.dll include\sunmatrix\sunmatrix_dense.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunmatrixsparse -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunmatrixsparse lib\sundials_sunmatrixsparse.dll include\sunmatrix\sunmatrix_sparse.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunnonlinsolfixedpoint -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunnonlinsolfixedpoint lib\sundials_sunnonlinsolfixedpoint.dll include\sunnonlinsol\sunnonlinsol_fixedpoint.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.sunnonlinsolnewton -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_sunnonlinsolnewton lib\sundials_sunnonlinsolnewton.dll include\sunnonlinsol\sunnonlinsol_newton.h
 
 java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials ^
 -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials.core -f -I include^
 -I "C:\msys64\mingw64\include" ^
 -I "C:\msys64\mingw64\lib\gcc\x86_64-w64-mingw32\11.2.0\include" ^
 -I "C:\Users\Administrator\AppData\Roaming\JModelica.org-2.14\Ipopt\Ipopt64\include\coin\ThirdParty" ^
 -library sundials_core lib\sundials_core.dll include\sundials\sundials_adaptcontroller.h include\sundials\sundials_band.h include\sundials\sundials_context.h include\sundials\sundials_core.h include\sundials\sundials_dense.h include\sundials\sundials_direct.h include\sundials\sundials_errors.h include\sundials\sundials_iterative.h include\sundials\sundials_linearsolver.h include\sundials\sundials_logger.h include\sundials\sundials_math.h include\sundials\sundials_matrix.h include\sundials\sundials_memory.h include\sundials\sundials_mpi_types.h include\sundials\sundials_nonlinearsolver.h include\sundials\sundials_nvector.h include\sundials\sundials_profiler.h include\sundials\sundials_types_deprecated.h include\sundials\sundials_types.h include\sundials\sundials_version.h
 
 
```