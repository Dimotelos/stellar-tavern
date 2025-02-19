## 开发计划

### 构建器内容

- [ ] 国际化文本`zh_cn.json`
- [ ] 国际化文本`en_us.json`
- [ ] 通用`Block`
  - [ ] `models`生成
  - [ ] `blockstates`生成
  - [ ] `BlockItem`的`models`生成
- [ ] 特殊`Block`
  - [ ] `models`生成
  - [ ] `blockstates`生成
  - [ ] `BlockItem`的`models`生成
- [x] 通用`Item`的`models`生成
- [ ] `repices`的自动生成

### 新增内容

#### `Item`

- 菜单`stellartavern:menu`
  - [x] `Register`注册
  - [x] `models`/`textures`制作
  - [ ] 绑定收银台
  - [ ] 通过收银台或右键打开GUI以编辑当前店面可点单食物
- 账簿`stellartavern:account_book`
  - [x] `Register`注册
  - [x] `models`/`textures`制作
  - [ ] 绑定收银台
  - [ ] 显示当前店面信息
  - [ ] 作为操作物品使得悬挂式告示牌转化为营业牌
- 奥罗拉核心`stellartavern:aurora_core`
  - [x] `Register`注册
  - [x] `models`/`textures`制作
- 奥罗拉宝石`stellartavern:aurora_gem`
  - [x] `Register`注册
  - [x] `models`/`textures`制作

#### `Block`

- 奥罗拉矿石`#aurora_ore`
  - [ ] 奥罗拉矿石`aurora_ore`
    - [x] `Register`注册
    - [x] `models`/`textures`制作
  - [ ] 深板岩奥罗拉矿石`deepslate_aurora_ore`
    - [x] `Register`注册
    - [x] `models`/`textures`制作
  - [ ] 挖掘可掉落奥罗拉宝石和经验
- 吧台凳`stellartavern:bar_stool`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
- 吧台椅`stellartavern:bar_chair`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
  - [ ] 有方向
- 酒吧凳`stellartavern:pub_stool`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
- 酒吧椅`stellartavern:pub_chair`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
  - [ ] 有方向
- 沙发`stellartavern:sofa`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
  - [ ] 有方向
- 传菜桌`stellartavern:food_pass_table`
  - [x] `Register`注册
  - [x] `models`/`textures`制作
  - [ ] 具有1输入、1输出容器空间
    - [ ] 输入容器空间可放入托盘类物品
    - [ ] 放入的托盘类物品会显示模型
    - [ ] 当存在托盘类物品时，持任何`food`的`item`右击，返回带有该`item`的托盘到输出容器空间
    - [ ] 右击时，若输出容器空间存在物品，将其变为掉落物
- 洗碗台`stellartavern:dishwashing`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
  - [ ] 手持托盘类物品且`dirty>0`时右击会`dirty = dirty - 1`
- 星痕洗碗台`stellartavern:starscar_dishwashing`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
  - [ ] 手持托盘类物品、玩家身上的`starscar>=1`且`dirty>0`时右击会`starscar = starscar - 1`且`dirty = 0`
- 台面桌`stellartavern:counter_table`
  - [x] `Register`注册
  - [x] `models`/`textures`制作
  - [ ] 可合并
  - [ ] 普通情况的桌子判断角落需要有桌腿，非角落无需桌腿
  - [ ] 持账簿蹲下右击时，遍历检查连接的桌子及对应椅/凳的情况，判断是否可以作为一组桌子，若作为一组桌子还需要修改桌腿情况
- 收银台`stellartavern:cashier`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
  - [ ] 可绑定/放入菜单、账簿
  - [ ] 作为核心方块具有GUI
    - [ ] *还没细想......*
- 水龙头`stellartavern:faucet`
  - [ ] `Register`注册
  - [ ] `models`/`textures`制作
  - [ ] 方块下方1-2格有水方块(流动水方块/水源方块)时右键会产生水粒子
- 托盘`stellartavern:tray`
  - [x] `Register`注册
  - [x] `models`/`textures`制作
  - [ ] 可具有多种材质的形态
    - [ ] 预计影响顾客评级

### 原版修改内容

#### `Block`

- 悬挂式告示牌`#minecraft:all_hanging_signs`
  - [ ] 以修改状态和绑定的形式实现

#### `Mob`

- 村民`minecraft:villager`
  - [ ] 在点单开放的情况下生成特定村民，无法交易与绑定工作方块，不作为村庄成员
  - [ ] 具有特殊寻路ai，可以寻找成组的绑定桌子对应的椅/凳，且避免移动到桌子类方块上方