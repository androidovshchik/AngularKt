var path = require('path');

var rules = [{
    test: /\.html$/,
    use: [
        {
            loader: 'html-loader',
            options: {
                minimize: true
            }
        }
    ]
}, {
    test: /\.css$/,
    use: [
        'style-loader',
        'css-loader'
    ]
}, {
    test: /\.s[ac]ss$/,
    include: [
        path.resolve(__dirname, './src/kotlin')
    ],
    use: [
        'css-loader',
        'sass-loader'
    ]
}, {
    test: /\.(png|svg|jpg|gif)$/,
    use: [
        'file-loader?[name].[ext]&outputPath=img/'
    ]
}, {
    test: /\.(woff|woff2|eot|ttf|otf)$/,
    use: [
        'file-loader?[name].[ext]&outputPath=font/'
    ]
}];
config.module.rules.push(...rules);
module.exports = {
    entry: './src/index.js',
    output: {
        filename: 'js/bundle.js',
        path: path.resolve(__dirname, 'www')
    },
    devServer: {
        contentBase: './www'
    },
    module: {
        rules: [
            {
                test: /\.html$/,
                use: [
                    {
                        loader: 'html-loader',
                        options: {
                            minimize: true
                        }
                    }
                ]
            },
            {
                test: /\.css$/,
                use: [
                    'style-loader',
                    'css-loader'
                ]
            },
            {
                test: /\.scss$/,
                include: [
                    path.resolve(__dirname, './src/kotlin')
                ],
                use: [
                    'css-loader',
                    'sass-loader'
                ]
            },
            {
                test: /\.(png|svg|jpg|gif)$/,
                use: [
                    'file-loader?[name].[ext]&outputPath=img/'
                ]
            },
            {
                test: /\.(woff|woff2|eot|ttf|otf)$/,
                use: [
                    'file-loader?[name].[ext]&outputPath=font/'
                ]
            }
        ]
    }
};
config.module.rules.push({
    test: /\.s[ac]ss$/i,
    use: [
        // Creates `style` nodes from JS strings
        'style-loader',
        // Translates CSS into CommonJS
        'css-loader',
        // Compiles Sass to CSS
        'sass-loader',
    ],
});