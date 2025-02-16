```javascript
StartupEvents.registry('item', event => {
    [
        {id: "stellartavern:menu", name: "菜单"},
        {id: "stellartavern:account_book", name: "账簿"},
        {id: "stellartavern:aurora_core", name: "奥罗拉核心"},
        {id: "stellartavern:aurora_gem", name: "奥罗拉宝石"},
    ].forEach(item => {
        event.create(item.id).displayName(item.name)
    })
})

StartupEvents.registry('block', event => {
    [ 
        {id: "stellartavern:bar_stool", name: "吧台凳", type: "basic"},
        {id: "stellartavern:bar_chair", name: "吧台椅", type: "basic"},
        {id: "stellartavern:pub_stool", name: "酒吧凳", type: "basic"},
        {id: "stellartavern:pub_chair", name: "酒吧椅", type: "basic"},
        {id: "stellartavern:sofa", name: "沙发", type: "basic"},
        {id: "stellartavern:food_pass_table", name: "传菜桌", type: "cardinal"},
        {id: "stellartavern:dishwashing", name: "洗碗台", type: "cardinal"},
        {id: "stellartavern:starscar_dishwashing", name: "星痕洗碗台", type: "cardinal"},
        {id: "stellartavern:counter_table", name: "台面桌", type: "cardinal"},
        {id: "stellartavern:cashier", name: "收银台", type: "cardinal"},
        {id: "stellartavern:open_sign", name: "营业牌", type: "cardinal"},
        {id: "stellartavern:faucet", name: "水龙头", type: "cardinal"},
        {id: "stellartavern:tray", name: "托盘", type: "cardinal"},
    ].forEach(block => {
        event.create(block.id).displayName(block.name)
    })
})
```