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
java -jar jnaerator-0.12-shaded.jar -runtime JNA -mode Maven -mavenGroupId cn.catarc.jsundials -mavenArtifactId jsundials -o jna_code -package cn.catarc.jsundials -f -library lib\sundials_arkode.dll include\arkode\arkode.h -library lib\sundials_cvode.dll include\cvode\cvode.h -library lib\sundials_kinsol.dll include\kinsol\kinsol_ls.h -library lib\sundials_kinsol.dll include\kinsol\kinsol.h -library lib\sundials_nvecserial.dll include\nvector\nvector_serial.h -library lib\sundials_core.dll include\sundials\sundials_types.h -library lib\sundials_core.dll include\sundials\sundials_math.h -library lib\sundials_core.dll include\sundials\sundials_direct.h -library lib\sundials_core.dll include\sundials\sundials_dense.h -library lib\sundials_core.dll include\sundials\sundials_nvector.h -library lib\sundials_sunlinsoldense.dll include\sunlinsol\sunlinsol_dense.h -library lib\sundials_sunmatrixdense.dll include\sunmatrix\sunmatrix_dense.h