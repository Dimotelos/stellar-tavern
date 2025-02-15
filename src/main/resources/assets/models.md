```javascript
StartupEvents.registry('item', event => {
    [
        {id: "taellartavern:menu", name: "菜单"},
        {id: "taellartavern:account_book", name: "账簿"},
        {id: "taellartavern:aurora_core", name: "奥罗拉核心"},
        {id: "taellartavern:aurora_gem", name: "奥罗拉宝石"},
    ].forEach(item => {
        event.create(item.id).displayName(item.name)
    })
})

StartupEvents.registry('block', event => {
    [ 
        {id: "taellartavern:bar_stool", name: "吧台凳", type: "basic"},
        {id: "taellartavern:bar_chair", name: "吧台椅", type: "basic"},
        {id: "taellartavern:pub_stool", name: "酒吧凳", type: "basic"},
        {id: "taellartavern:pub_chair", name: "酒吧椅", type: "basic"},
        {id: "taellartavern:sofa", name: "沙发", type: "basic"},
        {id: "taellartavern:food_pass_table", name: "传菜桌", type: "cardinal"},
        {id: "taellartavern:dishwashing", name: "洗碗台", type: "cardinal"},
        {id: "taellartavern:starscar_dishwashing", name: "星痕洗碗台", type: "cardinal"},
        {id: "taellartavern:counter_table", name: "台面桌", type: "cardinal"},
        {id: "taellartavern:cashier", name: "收银台", type: "cardinal"},
        {id: "taellartavern:open_sign", name: "营业牌", type: "cardinal"},
        {id: "taellartavern:faucet", name: "水龙头", type: "cardinal"},
        {id: "taellartavern:tray", name: "托盘", type: "cardinal"},
    ].forEach(block => {
        event.create(block.id).displayName(block.name)
    })
})
```